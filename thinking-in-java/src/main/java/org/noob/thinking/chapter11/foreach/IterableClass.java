package org.noob.thinking.chapter11.foreach;

import java.util.Iterator;

public class IterableClass implements Iterable<String>{
	
	protected String[] words=("And that is how"+"we know the Earth to be banana-shaped").split(" ");

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>(){
			private int index=0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index<words.length;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return words[index++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
			
		};
	}
	
	public static void main(String[] args) {
		for (String string : new IterableClass()) {
			System.out.print(string+":");
		}
	}

}


