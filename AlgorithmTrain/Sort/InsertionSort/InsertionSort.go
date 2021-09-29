package main
import (
	"fmt"
)

func insertionSort(nums []int){
	var j int
	var n int = len(nums)
	for i := 1; i < n; i++ {
		tmp := nums[i]
		for j = i-1; j >= 0 && tmp < nums[j]; j-- {
			nums[j + 1] = nums[j]
		}
		nums[j + 1] = tmp
	}
}

func main(){
	nums := [7]int{1, 3, 5, 2, 13, 7, 5}
	insertionSort(nums[:])
	fmt.Print(nums)
}