package my.home.oop.task01.main;

import my.home.oop.task01.entity.Directory;
import my.home.oop.task01.entity.TextFile;
import my.home.oop.task01.view.View;

/*Создать объект класса текстовый файл, используя классы Файл,Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить*/
public class Main {

	public static void main(String[] args) {

		TextFile textFile = new TextFile("My file", " This is my text file.");

		textFile.setName("My textFile");

		Directory directory = new Directory();

		directory.addFile(textFile);

		View view = new View();

		view.print(textFile);

		textFile.addText(" I have created it.");

		view.print(textFile);

		directory.removeFile(textFile);

	}

}
