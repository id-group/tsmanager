import React, {Component} from 'react';
import {connect} from "react-redux";
import {Layout, notification} from "antd";
import {Route} from "react-router-dom";
import {Switch} from 'react-router-dom';
import './app.css';
import {APP_TITLE} from "../constants";
import {Content, Footer, Header} from "antd/lib/layout/layout";

const App = ({}) => {
    return (
        <React.Fragment>
            <Layout className="tsm-container">
                <Header>Здесь шапка</Header>
                <Content>Привет</Content>
                <Footer style={{ textAlign: 'center' }}>Менеджер Торговых Стратегий ©2022 Казанцев Андрей</Footer>
            </Layout>
        </React.Fragment>
    );
}

const mapStateToProps = ({}) => {
    return ({});
}

const mapDispatchToProps = (dispatch, {aiService}) => {
    return {
    }

}

export default App;
