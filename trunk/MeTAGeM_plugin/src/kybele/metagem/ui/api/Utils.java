package kybele.metagem.ui.api;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.eclipse.core.resources.ResourcesPlugin;

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
		System.out.println(tempDirectory);
		if(!directory.exists())
			directory.mkdirs();
		
		return tempDirectory + "/";
	}
	
}
