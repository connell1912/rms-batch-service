import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import "./assets/main.css";
import { Provider } from "react-redux";
import { store } from "./Store";
import { history } from "./utility/history";
import { Router, Switch, Route } from "react-router";
import LoginComponent from "./components/login-components/LoginContainer";
import RegisterComponent from "./components/register-components/RegisterContainer";

function App() {
  return (
    <div className="mainPage">
      <Provider store={store}>
        <Router history={history}>
          <Switch>
            <Route path="/register" component={RegisterComponent}/>
            <Route path="/" component={LoginComponent} />
          </Switch>
        </Router>
      </Provider>
    </div>
  );
}

export default App;
