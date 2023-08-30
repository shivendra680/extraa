package topicscom.hsbc.topics;

import java.util.Objects;

public class Topics {
	
	private String tid;
	private String name;
	@Override
	public String toString() {
		return "Topics [tid=" + tid + ", name=" + name + "]";
	}
	
	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(tid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Topics other = (Topics) obj;
		return tid == other.tid;
	}

}
