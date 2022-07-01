import React from 'react';
import ReactDOM from 'react-dom';
//import store from "./store";
import {Provider} from "react-redux";
import App from "./app";
import {BrowserRouter} from "react-router-dom";
import './index.css';

ReactDOM.render(
    //<Provider store={store}>
        <BrowserRouter>
            <App />
        </BrowserRouter>
    //</Provider>
    ,document.getElementById('tsm-container')
);

