import { createContext, useState } from "react";

const ThemeContext = createContext()

const ThemeProvider = ({children}) => {

    const [isDarkMode, setIsDarkMode] = useState(false);

    const toggleTheme = () => setIsDarkMode(prev => !prev);

    const value = {isDarkMode, toggleTheme}

    return(
        <ThemeContext.Provider value={value}>
            {children}
        </ThemeContext.Provider>
    )
}

export {ThemeContext,ThemeProvider};