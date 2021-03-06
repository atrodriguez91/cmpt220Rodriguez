package classes;
//Reference stackoverflow, Java manual


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MakeSmall {
	private ArrayList<File> files;
	private String zipname;

	
	public MakeSmall(ArrayList<File> files, String zipname){
		this.files = files;
		this.zipname = zipname;
	}

	public String zipFiles(){
		
		byte[] buffer = new byte[10000];
		
		int len;
		
		try {
			if(zipname.contains(".")){
				zipname = zipname.split(".")[0] + ".zip";
			}else{
				zipname = zipname + ".zip";
			}
			File outputFile = new File(zipname);
			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outputFile));
			
			out.setLevel(Deflater.DEFAULT_COMPRESSION);

			for (int i = 0; i < files.size(); i++) {
				FileInputStream in = new FileInputStream(files.get(i));

				String filename = files.get(i).getName();
				out.putNextEntry(new ZipEntry(filename));

				while ((len = in.read(buffer)) > 0){
					out.write(buffer, 0, len);
				}
				out.closeEntry();
				in.close();

			}
			out.close();
			return "Comp successful";
		}catch(Exception e){
			return "A exception occured. "+e;
		}
	}
}