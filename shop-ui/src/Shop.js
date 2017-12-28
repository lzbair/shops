import React, { Component } from 'react';

class Shop extends Component {

  constructor(props) {
    super(props);
    this.state = {shop: props.obj};
  }

  render() {
    return (
        	  <ul>
              <li>{this.state.shop.name}</li>
            </ul>

    );
  }
}

export default Shop;
