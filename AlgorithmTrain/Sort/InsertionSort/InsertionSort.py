def insertionSort(nums):
    n = len(nums)
    for i in range(1,n):
        j = i-1
        while j>=0 and nums[j+1]<nums[j]:
            #交換nums[j]和nums[j+1]
            nums[j],nums[j+1]=nums[j+1],nums[j] 
            j -= 1


if __name__ == "__main__":
    nums = [1, 3, 5, 2, 13, 7, 5]
    insertionSort(nums)
    print(nums)
