package org.noob.thinking.chapter11.foreach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ReversibleArrayList<T> extends ArrayList<T> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ReversibleArrayList(Collection<T> c) {
		super(c);
	}

	public Iterable<T> reversed() {
		return new Iterable<T>() {

			@Override
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					int current = size() - 1;

					@Override
					public boolean hasNext() {
						return current > -1;
					}

					@Override
					public T next() {
						return get(current--);
					}

					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}

		};
	}

}
