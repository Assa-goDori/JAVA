public class Test1 {
	public static void main(String[] args) {
		String fullPath = "c:/jdk12/work/Test.java";
		String path = fullPath.substring(0, fullPath.lastIndexOf("/"));
		String fileName = fullPath.substring(path.length()+1, fullPath.length());
		System.out.println("fullPath : " + fullPath);
		System.out.println("path : " + path);
		System.out.println("fileName : " + fileName);
	}
}