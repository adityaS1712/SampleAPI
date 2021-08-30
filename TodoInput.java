package hello;

public class TodoInput {
	
	
	
	private String name;
	private String description;
	private String dateTime;
	private String status;
	private String category;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "TodoInput [name=" + name + ", description=" + description + ", dateTime=" + dateTime + ", status="
				+ status + ", category=" + category + "]";
	}
	
	
	
	
	

}
