Description:-

Netflix maintains a popularity score for each of its titles. This popularity score is derived from customer feedback, likes, dislikes, etc. This score is updated weekly and added to the end of an array containing previous scores for the same title. This score array helps Netflix identify titles that may be increasing or decreasing in popularity over time. Some titles may be steady in popularity, increasing, decreasing, and fluctuating. We want to identify and separate a title if it is gaining or losing popularity.

We’ll be provided with an array of integers representing the popularity scores of a movie collected over a number of weeks. We need to identify only those titles that are either increasing or decreasing in popularity, so we can separate them from the fluctuating ones for better analysis.

Solution:-

An array is increasing if the expression arr[i] <= arr[i + 1] evaluates to true for every element at index i. Similarly, an array is decreasing if the expression arr[i] >= arr[i + 1] evaluates to true for every element at index i.

From the start, we’ll assume that the array is either increasing or decreasing. We have established that there won’t be any adjacent values of the form arr[i] > arr[i + 1] for the increasing array, and there won’t be any adjacent values of the form arr[i] < arr[i + 1] for decreasing array. For the array to be either increasing or decreasing, all pairs of consecutive elements must obey one of these conditions, but not both.

If both increasing and decreasing variables are still true by the end, it means that the popularity is constant and not fluctuating.