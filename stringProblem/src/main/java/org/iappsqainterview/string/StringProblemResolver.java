package org.iappsqainterview.string;

public class StringProblemResolver {

	public String resolve1(String in, Character toRemove) {
		if (in == null)
			return null;
		if (toRemove == null) {
			return in;
		}
		StringBuilder sb = new StringBuilder();
		byte[] b1;
		for (byte b:in.getBytes()) {
			if (b != toRemove.charValue()) {
				b1= new byte[]{b};
				sb.append(new String(b1));
			}
		}
		return sb.toString();
	}
	
	public String resolve2(String in, Character toRemove) {
		if (in == null)
			return null;
		if (toRemove == null) {
			return in;
		}
		return in.replaceAll(toRemove.toString(), "");
	}

}
