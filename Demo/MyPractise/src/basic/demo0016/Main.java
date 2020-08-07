package basic.demo0016;

public class Main {
    public static void main(String[] args) {
        // 创建目录
        String dirName = "e:/temp";
        CreateFileUtil.createDir(dirName);
        // 创建文件
        String fileName = dirName + "/temp2/tempFile.txt";
        CreateFileUtil.createFile(fileName);
        // 创建临时文件
        String prefix = "temp";
        String suffix = ".txt";
        for (int i = 0; i < 10; i++) {
            System.out.println("创建了临时文件：" + CreateFileUtil.createTempFile(prefix, suffix, dirName));
        }
        // 在默认目录下创建临时文件
        for (int i = 0; i < 10; i++) {
            System.out.println("在默认目录下创建了临时文件：" + CreateFileUtil.createTempFile(prefix, suffix, null));
        }
    }
}
