/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Hamdy
 */

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	private Scanner scanner;
	private TodoList todolist;

	public UserInterface(TodoList todoList, Scanner scanner) {
		this.scanner = scanner;
		this.todolist = todoList;
	}

	public void start() {

		while (true) {
			System.out.print("Command: ");
			String command = scanner.nextLine();

			if (command.equals("stop")) {
				break;
			} else if (command.equals("add")) {
				System.out.print("To add: ");
				String newTask = this.scanner.nextLine();
				todolist.add(newTask);
			} else if (command.equals("list")) {
				this.todolist.print();
			} else if (command.equals("remove")) {
				System.out.print("Which one is removed?");
				int indexToRemove = Integer.valueOf(this.scanner.nextLine());
				this.todolist.remove(indexToRemove);
			}
		}
	}
}
