public class launchFile {
    public static void main(String[] args)throws Exception {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("C:\\Windows\\notepad.exe C:\\test.txt");
    }
}



