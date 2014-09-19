package be.intec.frituurfrida.interfaces;

import java.util.List;


public interface MainDaoInterface<T> {
	
	public void add(T obj);

	public void update(T obj);

	public List<T> show();

	public void delete(T obj);

	public Object getItem(T obj);

}
