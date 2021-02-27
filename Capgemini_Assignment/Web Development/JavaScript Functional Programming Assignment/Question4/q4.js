const map = (arr, f) => () => {
  for (i = 0; i < arr.length; i++) {
    arr[i] = f(arr[i]);
  }
  return arr;
};
const square = (x) => x * x;

const getS = map([1, 2, 3, 4, 5], square);
console.log(getS());

const getSq = map([1, 4, 9, 16, 25], Math.sqrt);
console.log(getSq());