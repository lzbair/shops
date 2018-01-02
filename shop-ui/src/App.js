import React, { Component } from 'react';
import Shop from './Shop';
import './App.css';

class App extends Component {

  constructor(props) {
  		super(props);
  		this.state = {shops: []};
  	}

  componentDidMount() {
    fetch('/api/shop/all').then(response => response.json())
                          .then(shops => this.setState({ shops }));
	}
  render() {
    return (
    <div>
    <h1 className="App-title">Available Shops</h1>
        {this.state.shops.map(function(value)
          { return <Shop  key={value.id} obj={value}/>; })}
    </div>
    );
  }
}

export default App;
