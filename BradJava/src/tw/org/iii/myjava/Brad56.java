package tw.org.iii.myjava;

import java.io.File;

public class Brad56 {
	public static void main(String[] args) {
		File dir1 = new File("mytest/dir1/dir2/dir3/dir4");
		if (dir1.isDirectory()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
			if (dir1.mkdirs()) {
				System.out.println("mkdir success!");
			}else {
				System.out.println("mkdir failure!");
			}
		}
		
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root.getAbsolutePath());
		}
		
	}

}
