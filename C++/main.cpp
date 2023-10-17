//
//  main.cpp
//  Playground
//
//  Created by Guy Bade on 13/10/2023.
//

#include <iostream>
#include <cstdlib>
#include <ctime>

/**
 * This function allows you to generate fill a  table with random numbers
 */
void fillTableWithRandomValue(int *ptr, int size,int borne);

/**
 * This function return a random value
 */
int getRandomValue(int borne);

/**
 * This function allows you to display a value of a   table
 */
void displayValue(int *ptr,int size);

/**
 * This function allows you to sort table
 */
void sortTable(int *ptr, int size);

/**
 * This function allows you to ask a questions
 * it use lvalue references to assign size and borne value
 */
void askQuestion(int &size, int &borne);



void fillTableWithRandomValue(int *ptr, int size,int borne){
    for (int i = 0; i < size; i++) {
        ptr[i] = getRandomValue(borne);
    }
}

int getRandomValue(int borne){
    return rand() % borne;
}

void displayValue(int *ptr,int size){
    std::cout << "[";
    for(int i= 0; i < size ; i++){
        std::cout << ptr[i];
        if(i != size - 1)
            std::cout << ",";
    }
    std::cout << "]" << std::endl;
}

void sortTable(int *ptr, int size) {
    bool sorted = false; // Flag to know if the array is sorted
    
    while (!sorted) {
        sorted = true;
        for (int i = 0; i < size - 1; i++) {
            if (ptr[i] > ptr[i + 1]) {
                // Swap items if necessary
                int temp = ptr[i+1];
                ptr[i+1] = ptr[i];
                ptr[i] = temp;
                sorted = false; // The array is not yet sorted
            }
        }
    }
}

void askQuestion(int &size, int &borne){
    std::cout << "How many boxes do you want to allocate ? : ";
    std::cin >> size;
    std::cout << std::endl;
    std::cout << "Enter a limit for random number generation: ";
    std::cin >> borne;
}


int main(int argc, const char * argv[]) {
    srand ((unsigned int)time(0));
    
    int size,borne;
    askQuestion(size, borne);
    int *p = new int[size];
    
    fillTableWithRandomValue(p, size, borne);
    sortTable(p, size);
    displayValue(p, size);
    delete[] p;
    
    return 0;
}


