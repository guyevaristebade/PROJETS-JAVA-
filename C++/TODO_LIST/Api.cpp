//
//  Api.cpp
//  TODO_LIST
//
//  Created by Guy Bade on 16/10/2023.
//

#include "Api.hpp"
#include <iostream>
#include <vector>
#include <string>
#include <fstream>

Api::Api(){}

void Api::menu(){
    
    std::cout << "---- Welcome to MyNotes ----" << std::endl;
    std::cout << "0 - Quit" << std::endl;
    std::cout << "1 - Add todo" << std::endl;
    std::cout << "2 - Delete todo" << std::endl;
    std::cout << "3 - Edit todo" << std::endl;
    std::cout << "4 - Display todo list" << std::endl;
    std::cout << "5 - save todo list in file" << std::endl;
    
}

void Api::edit_todo(std::vector<std::string> &todo_list, int index, std::string n_todo){
    
    if(!todo_list.empty()){
        todo_list[index - 1] = n_todo;
        std::cout << "todo edited successfully " << std::endl;
    }else{
        std::cout << "Error todolist is empty " << std::endl;
    }
}


void Api::display_todo(std::vector<std::string> &todo_list){
    
    int i = 1;
    if(!todo_list.empty()){
        for(std::string tache : todo_list){
            std::cout << i << " - " << tache << std::endl;
            i++;
        }
    }else{
        std::cout << "TodoList is empty !!!, Please fill TodoList before to display" << std::endl;
    }
    std::cout << '\n';

}

void Api::add_todo(std::vector<std::string> &todo_list,std::string &todo){
    
    if(todo != ""){
        todo_list.push_back(todo);
        std::cout << "todo added successfully " << std::endl;
    }else{
        std::cout << "please enter todo !!!" << std::endl;
    }
    
}

void Api::save_todo(std::vector<std::string> &todo_list){
    std::ofstream save_file {"save_file.txt"};
    
    if(!todo_list.empty()){
        int i = 1;
        for(std::string todo : todo_list){
            save_file << "Tache " << i << " - " << todo << std::endl;
            i++;
        }
        std::cout << "todos saved successfully !!" << std::endl;
    }else{
        std::cout << "TodoList is empty. Echec Writting !!" << std::endl;
    }
}


void Api::delete_todo(std::vector<std::string> &todo_list){
    int index;
    std::cout << "Entrez l'index de la tache à supprimer : ";
    std::cin >> index;
    
    if(!todo_list.empty()){
        todo_list.erase(todo_list.begin(), todo_list.begin() + index);
    }else{
        std::cout << "Todo List is empty" << std::endl;
    }
}


/*
comment gérer les erreurs les plus courantes
 - index qui n'existe pas
 - donnée invalid dans l'entrée standard
 **/
