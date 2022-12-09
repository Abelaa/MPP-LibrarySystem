package business;

import java.io.Serializable;

final public class Author extends Person implements Serializable {
	private String bio;
	private boolean hasCredential;
	public String getBio() {
		return bio;
	}
	public boolean getCredential() {
		return hasCredential;
	}
	public Author(String f, String l, String t, Address a, String bio, boolean hasCredential) {
		super(f, l, t, a);
		this.bio = bio;
		this.hasCredential = hasCredential;
	}

	private static final long serialVersionUID = 7508481940058530471L;
}
