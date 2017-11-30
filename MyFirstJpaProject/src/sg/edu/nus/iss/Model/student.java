package sg.edu.nus.iss.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class student {
	@Id
	private int id;
	@Basic
	@Column (name="studentName")
	private String name;
	@Column (name="nick")
	private String studentNick;
	public student(int id, String studentName, String nick) {
		super();
		this.id = id;
		this.name = studentName;
		this.studentNick = nick;
	}
	
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return name;
	}
	public void setStudentName(String studentName) {
		this.name = studentName;
	}
	public String getNick() {
		return studentNick;
	}
	public void setNick(String nick) {
		this.studentNick = nick;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "student [id=" + id + ", studentName=" + name + ", nick=" + studentNick + "]";
	}
	
	
	

}
