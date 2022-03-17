package cts.sh.FilmService.model;

public class Film {
	private int id;
	private String name;
	private String desc;
	public Film(int id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}
}
