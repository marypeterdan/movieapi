 //chunk
// function to get input from user and return the average of the numbers

function sum(...args) {
    let sum = 0;
    for (let i = 0; i < args.length; i++) {
        sum += args[i];
    }
    return sum;
}

function average(...args) {
    let avg = sum(...args) / args.length;
    avg = 0.0;
    for (i = 0; i < count; i++)
        avg += data[i];
    avg /= count;
    return avg;
}

console.log(average(1, 2, 3, 4, 5, 6)); // 3.5

