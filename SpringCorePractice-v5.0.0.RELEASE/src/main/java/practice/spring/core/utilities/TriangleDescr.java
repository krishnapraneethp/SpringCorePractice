package practice.spring.core.utilities;

public class TriangleDescr {

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

	public TriangleDescr(String type) {
		this.type = type;
	}

	public TriangleDescr() {
	}

	public TriangleDescr(int height) {
		this.height = height;
	}

	public TriangleDescr(int height, int width, String type, String author) {
		this.type = type;
		this.height = height;
		this.author = author;
		this.width = width;
	}

	@Override
	public String toString() {
		return this.getType() + " Triangle drawn by " + this.getAuthor() + " with height "
				+ this.getHeight() + " and width " + this.getWidth();
	}
	
	public String description() {
		return this.toString();
	}
}
