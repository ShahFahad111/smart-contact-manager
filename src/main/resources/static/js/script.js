console.log("Script Loaded")

let currentTheme = getTheme();


document.addEventListener('DOMContentLoaded', () => {
 changeTheme();
});




function changeTheme(){
    // set to web page
    document.querySelector('html').classList.add(currentTheme);

    // set the listener to change theme button
    const changeThemeButton = document.querySelector('#theme_change_button');
    changeThemeButton.querySelector("span").textContent = currentTheme == 'light' ? 'Dark' : 'Light';
    changeThemeButton.addEventListener("click", (event) => {
        console.log("change theme button listener");
        const oldTheme = currentTheme;
        if(currentTheme === "dark"){
            currentTheme="light";
        } else {
            currentTheme = "dark";
        }

        // localStroage update
        setTheme(currentTheme);
        //remove the current theme
        document.querySelector('html').classList.remove(oldTheme);
        //set the current theme
        document.querySelector('html').classList.add(currentTheme);

        //change the text of button
        changeThemeButton.querySelector("span").textContent = currentTheme == 'light' ? 'Dark' : 'Light';
    });
}

//set theme to localStorage
function setTheme(theme){
    localStorage.setItem("theme", theme);
}

//get theme from localStorage
function getTheme(){
    let theme = localStorage.getItem("theme");
    if(theme)
        return theme;
    else
        return "light";
}