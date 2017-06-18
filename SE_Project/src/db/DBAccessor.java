package db;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class DBAccessor {
	
	protected File file;
	
	public abstract ArrayList<Serializable> readFile();
	public abstract void writeFile(ArrayList<Serializable> items);
}
