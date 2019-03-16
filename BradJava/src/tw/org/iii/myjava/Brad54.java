package tw.org.iii.myjava;

import java.io.File;

public class Brad54 {

	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		String path = "C:\\Program Files (x86)\\Common Files\\Oracle\\Java\\javapath;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\WINDOWS\\System32\\Wbem;C:\\WINDOWS\\System32\\WindowsPowerShell\\v1.0\\;C:\\WINDOWS\\System32\\OpenSSH\\;C:\\Program Files\\Java\\jdk1.8.0_201\\bin;C:\\Users\\user\\AppData\\Local\\Microsoft\\WindowsApps;C:\\Program Files\\Java\\jdk1.8.0_201\\bin;";

		String[] p = path.split(File.pathSeparator);
		for (String v : p) {
			System.out.println(v);
		}
		
	}

}
