const product = {
  name: "Laptop",
  price: 1200
};
console.log("Reading price:");
console.log(Reflect.get(product, "price"));
console.log("Writing price:");
Reflect.set(product, "price", 1500);
console.log("Updated price:");
console.log(Reflect.get(product, "price"));