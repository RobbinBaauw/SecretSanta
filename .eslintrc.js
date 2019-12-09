module.exports = {
    root: true,
    env: {
        node: true,
        es6: true
    },
    ecmaFeatures: {
        modules: true
    },
    extends: ["eslint:recommended", "prettier"],
    plugins: ["eslint-plugin-prettier"],
    parserOptions: {
        ecmaVersion: 11,
        sourceType: "module"
    },
    parser: "babel-eslint",
    rules: {
        "no-console": process.env.NODE_ENV === "production" ? "error" : "off",
        "no-unused-vars": "off",
        "no-debugger": process.env.NODE_ENV === "production" ? "error" : "off",
        "prettier/prettier": [
            "error",
            {
                semi: true,
                tabWidth: 4,
                printWidth: 120
            }
        ],
        "no-dupe-class-members": "off"
    }
};
