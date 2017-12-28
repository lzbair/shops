This project was bootstrapped with [Create React App](https://github.com/facebookincubator/create-react-app).

## Prerequisites
NPM 5.6.0 or later  
NodeJS 6.11.3 or later

## Installation
In the project directory, you can run:
`npm install`

## Developemnt
`npm start`

Runs the app in the development mode.<br>
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.

The page will reload if you make edits.<br>
You will also see any lint errors in the console.

`npm test`

Launches the test runner in the interactive watch mode.<br>
See the section about [running tests](#running-tests) for more information.

## Production
Builds the app for production to the `build` folder.<br>

The build is minified and the filenames include the hashes.<br>

### Deployement
One way is to use NodeJS and install a static sever:

```sh
npm install -g serve
serve -s build
```

The last command shown above will serve your static site on the port **5000**.

Run this command to get a full list of the options available:

```sh
serve -h
```