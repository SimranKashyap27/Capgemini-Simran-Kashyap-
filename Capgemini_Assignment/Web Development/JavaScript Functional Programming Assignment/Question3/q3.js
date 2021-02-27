const find = (arr, f) => () => {
    for (i = 0; i < arr.length; i++) {
      if (f(arr[i])) {
        return arr[i];
      }
      continue;
    }
  };
  
  // const find = function(arr,f) {
  //     return function() {
  //         for(i=0; i<arr.length; i++){
  //             if(f(arr[i])){
  //                 return arr[i]
  //             }
  //             continue
  //         }
  //     }
  // }
  
  function isEven(num) {
    return num % 2 == 0;
  }
  const getNo = find([1, 3, 5, 4, 2], isEven);
  
  console.log(getNo());