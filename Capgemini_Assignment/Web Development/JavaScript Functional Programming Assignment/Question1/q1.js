//Arrow function
const composedValue = (f1, f2, value) => () => f1(f2(value));

//Normal way
const composedValueNormal = function (f1, f2, value) {
  return function () {
    return f1(f2(value));
  };
};

function square(x) {
  return x * x;
}
function double(x) {
  return x * 2;
}

const getNumber = composedValue(square, double, 5);
const getNumberNormal = composedValueNormal(square, double, 5);

console.log("Result with Array Function : " + getNumber()); // I.e., square(double(5))
console.log("Result with Traditional Way : " + getNumberNormal()); // I.e., square(double(5))