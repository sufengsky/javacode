package basic.demo0008;

import java.io.Serializable;

public class Box implements Serializable {
	transient private int width; //将这个变量标记为不需要被 序列化
	private int height;

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}