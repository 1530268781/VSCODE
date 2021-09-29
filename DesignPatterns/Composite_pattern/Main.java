package DesignPatterns.Composite_pattern;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries.....,");
            Directory rootDir = new Directory("root");
            Directory bindDIr = new Directory("bind");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");
            Directory usr_zlx = new Directory("zlx");
            Directory usr_zzx = new Directory("zzx");
            rootDir.add(bindDIr);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);
            bindDIr.add(new File("vi", 10000));
            bindDIr.add(new File("latex", 20000));
            tmpDir.add(new File("diary.html", 5000));
            tmpDir.add(new File("test.txt", 1000));
            usrDir.add(usr_zlx);
            usrDir.add(usr_zzx);
            usrDir.add(new File("usr.conf", 1000));
            rootDir.printList();

            File textFile = new File("test.txt", 10000);
            textFile.add(new File("exception", 0));
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
