package practice.spring.core.shapes;

public class Triangle {

	private int height;
	private int width;
	private String author;
	private String type;

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public String getType() {
		return type;
	}

	public String getAuthor() {
		return author;
	}

	public Triangle(String type) {
		this.type = type;
	}

	public Triangle(int height) {
		this.height = height;
	}

	public Triangle(int height, int width, String type, String author) {
		this.type = type;
		this.height = height;
		this.author = author;
		this.width = width;
	}

	public void draw() {
		System.out.println(this.getType() + " Triangle drawn by " + this.getAuthor() + " with height "
				+ this.getHeight() + " and width " + this.getWidth());
	}
}
