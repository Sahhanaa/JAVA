//1
const user = {
    firstName: "Sahhana",
    lastName: "Radhakrishnan",
    email: "sahhana13@gmail.com"
};
const fullName = (
    user.firstName + " " + user.lastName
).toUpperCase();
const emailDomain = user.email.split("@")[1];
console.log("Full Name :", fullName);
console.log("Email     :", user.email);
console.log("Domain    :", emailDomain);

//2
const sentence = "JavaScript is very easy to learn and it seems little difficult";
const result = {
    totalCharacters: sentence.length,
    totalWords: sentence.split(" ").length,
    lowercaseSentence: sentence.toLowerCase()
};
console.log(result);

//3
const name = "Sahhana";
const phoneNumber = "9876543210";
const username =
    name.substring(0, 3).toLowerCase() +
    phoneNumber.slice(-2);
console.log("Username:", username);