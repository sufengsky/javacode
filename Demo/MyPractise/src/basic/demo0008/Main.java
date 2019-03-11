package basic.demo0008;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	/**
	 * 对象的序列化
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Box box = new Box();

		box.setWidth(10);
		box.setHeight(20);

		try {
			FileOutputStream fs = new FileOutputStream("src/basic/demo0008/foo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(box);// 将对象序列化后写班到文件中
			os.close();

			// 将对向反序列化
			FileInputStream fi = new FileInputStream("src/basic/demo0008/foo.ser");
			ObjectInputStream isInputStream = new ObjectInputStream(fi);
			Box obj = (Box) isInputStream.readObject();
			System.out.println(obj.getHeight()); // 20
			System.out.println(obj.getWidth()); // 由于在序列化时没有进行序列化，所以这个属性的值为0
			isInputStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
