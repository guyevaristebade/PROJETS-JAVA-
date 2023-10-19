//
//  main.cpp
//  TODO_LIST
//
//  Created by Guy Bade on 16/10/2023.
//

#include <iostream>
#include <vector>
#include <string>
#include <fstream>
#include "Api.hpp"

int main(int argc, const char * argv[]) {
    std::vector<std::string> todo_list{};
    std::string new_tache;
    int choice, index;
    bool loop {true};
    
    Api api;
    
    while(loop){
        //display menu
        api.menu();
        
        //get user choice
        std::cin >> choice;
        
        if(choice >= 0 || choice <= todo_list.size()){ // problème ave cette condition entre le choix du && et ||
            switch (choice) {
                case 1:
                    std::cout << "Enter your todo or write 'back' for return in back page : ";
                    std::cin.clear();
                    std::cin.ignore(std::numeric_limits<std::streamsize>::max(),'\n');
                    std::getline(std::cin , new_tache);
                    
                    if(new_tache == "back")
                        break;
                    
                    api.add_todo(todo_list, new_tache);
                    break;
                    
                case 2:
                    api.delete_todo(todo_list);
                    break;
                
                case 3:
                    std::cout << "Enter the index of todo we want to edit : " ;
                    std::cin >> index;
                    
                    std::cout << "Enter the new todo text which replace old todo text: ";
                    std::cin >> new_tache;
                    
                    api.edit_todo(todo_list,index,new_tache);
                    api.display_todo(todo_list);
                    break;
                    
                case 4:
                    api.display_todo(todo_list);
                    break;
                    
                case 5:
                    api.save_todo(todo_list);
                    break;
        
                case 0:
                    loop = false;
                    break;
            }
        }else{
            std::cout << "Enter number in this range 0 - 5, thank you." << std::endl;
        }
    }
    
    return 0;
}
