package gui.file.filter;

import java.io.File;

import javax.swing.filechooser.FileFilter;

import uti.Utilitiess;

public class TextFileFilter extends FileFilter {

	public boolean accept(File file) {
		
		if(file.isDirectory()) {
			return true;
		}
		
		if(Utilitiess.getExtension(file.getName()) == "txt") {
			return true;
		}
		
		return false;
	}

	public String getDescription() {
		
		return "Text files (.txt)";
	}
}
