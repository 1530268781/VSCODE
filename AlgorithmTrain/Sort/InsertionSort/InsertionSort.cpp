#include <iostream>
using namespace std;

void insertionSort(int nums[]){
    int i, j, n = sizeof(nums) /sizeof(nums[0]);
    for(i = 1; i < n; i++){
        int tmp = nums[i];
        for(j = i -1; j >= 0 && tmp < nums[j]; j--){
            nums[j + 1] = nums[j];
        }
        nums[j + 1] = tmp;
    }
}

int main(){
    int nums[] = { 1, 3, 5, 2, 13, 7, 5 };
    insertionSort(nums);
    for(int i = 0; i < 7; i++){
        cout<<nums[i]<<" ";
    }
}