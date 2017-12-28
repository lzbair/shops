import React, { Component } from 'react';
import Shop from './Shop';
import './App.css';
const network = require('./network.js');

class App extends Component {

  constructor(props) {
  		super(props);
  		this.state = {shops: []};
  	}

  componentDidMount() {
		network({method: 'GET', path: 'http://localhost:9000/api/shop/all'}).done(response => {
			this.setState({shops: response.entity});
		});
	}
  render() {
    return (
    <div>
    <h1 className="App-title">Available Shops</h1>
        {this.state.shops.map(function(value)
          { return <Shop obj={value}/>; })}
    </div>
    );
  }
}

export default App;
