package kybele.metagem.ui.api;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class Utils {
	
	public static File writeToFile(InputStream is, File file) {
		try {
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			int c;
			while((c = is.read()) != -1) {
				out.writeByte(c);
			}
			is.close();
			out.close();
			return file;
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String getTempDirectory() {
		
		String tempDirectory = ResourcesPlugin.getWorkspace().getRoot().getLocation() + "/.metadata/.plugins/MeTAGeM";
		//String tempDirectory = new Path(Platform.getInstallLocation().getURL().getPath()).getDevice() + "/temp"; 
		File directory = new File(tempDirectory);
		//System.out.println(tempDirectory);
		if(!directory.exists())
			directory.mkdirs();
		
		return tempDirectory + "/";
	}
	
	//This method allows register a Metamodel
	public static void registerMetamodel(String URImetaModel, InputStream input) {
		
		Resource.Factory myEcoreFactory = new EcoreResourceFactoryImpl();
		Resource mmExtent = myEcoreFactory.createResource(URI.createURI(URImetaModel));
		try {
			mmExtent.load(input,Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		for(Iterator it = getElementsByType(mmExtent,"EPackage").iterator() ; it.hasNext() ; ) {
			EPackage p = (EPackage)it.next();
			String nsURI = p.getNsURI();
			if(nsURI == null) {
				nsURI = p.getName();
				p.setNsURI(nsURI);
			}
			EPackage.Registry.INSTANCE.put(nsURI, p);
		}
		
		for(Iterator it = getElementsByType(mmExtent,"EDataType").iterator(); it.hasNext(); ) {
			EObject eo = (EObject)it.next();
			EStructuralFeature sf;
			sf = eo.eClass().getEStructuralFeature("name");	 
			String tname = (String)eo.eGet(sf);			 
			String icn = null;
			if(tname.equals("Boolean"))
				icn = "java.lang.Boolean";
			else if(tname.equals("Double"))
				icn = "java.lang.Double";
			else if(tname.equals("Float"))
				icn = "java.lang.Float";
			else if(tname.equals("Integer"))
				icn = "java.lang.Integer";
			else if(tname.equals("String"))
				icn = "java.lang.String";
			
			if(icn != null) {
				sf = eo.eClass().getEStructuralFeature("instanceClassName");
				eo.eSet(sf, icn);                
			}
		}
		
	}
	private static Set getElementsByType(Resource extent,String type) {
		Set ret = new HashSet();
		for(Iterator i = extent.getAllContents(); i.hasNext(); ) {
			EObject eo = (EObject)i.next();
			if (eo.eClass().getName().equals(type))
				ret.add(eo);
		}
		return ret;
	}
	
	/**
	 * Finds the file in the plug-in. Returns the file URL.
	 * 
	 * @param fileName
	 *            the file name
	 * @return the file URL
	 * @throws IOException
	 *             if the file doesn't exist
	 * 
	 * @generated
	 */
	
	public static URL getFileURL(String fileName) throws IOException {
		final URL fileURL;
		if (isEclipseRunning()) {
			URL resourceURL = Transformations.class.getResource(fileName);
			if (resourceURL != null) {
				fileURL = FileLocator.toFileURL(resourceURL);
			} else {
				fileURL = null;
			}
		} else {
			fileURL = Transformations.class.getResource(fileName);
		}
		if (fileURL == null) {
			throw new IOException("'" + fileName + "' not found");
		} else {
			return fileURL;
		}
	}

	/**
	 * Tests if eclipse is running.
	 * 
	 * @return <code>true</code> if eclipse is running
	 *
	 * @generated
	 */
	public static boolean isEclipseRunning() {
		try {
			return Platform.isRunning();
		} catch (Throwable exception) {
			// Assume that we aren't running.
		}
		return false;
	}
}
