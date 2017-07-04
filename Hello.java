public class Hello{
	public static void main(String[] args){
		long pid = ProcessHandle.current().getPid();
		while(true){
			System.out.println(pid);
		}
	}
}