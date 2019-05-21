package 牛客网项目;

import java.io.IOException;
import java.nio.file.*;
/**
 * 筛选出查找的类型
 * @author Administrator
 *
 */
public class WalkTree {
    public static void main(String[] args) throws IOException {
        Path start = FileSystems.getDefault().getPath("G:/大三下学期/【牛客带你学编程】Java学习资料分享/");
        Files.walk(start)
                .filter(path -> path.toFile().isFile())
                .filter(path -> path.toString().endsWith(".pdf"))
                .forEach(System.out::println);
    }
}