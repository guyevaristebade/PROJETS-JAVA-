//
//  Api.hpp
//  TODO_LIST
//
//  Created by Guy Bade on 16/10/2023.
//

#ifndef Api_hpp
#define Api_hpp

#include <iostream>
#include <vector>
#include <string>

class Api{
public:
    Api();
    void menu();
    void edit_todo(std::vector<std::string> &todo_list, int index, std::string n_todo);
    void display_todo(std::vector<std::string> &todo_list);
    void add_todo(std::vector<std::string> &todo_list,std::string &tache);
    void save_todo(std::vector<std::string> &todo_list);
    void delete_todo(std::vector<std::string> &todo_list);
};


#endif /* Api_hpp */
