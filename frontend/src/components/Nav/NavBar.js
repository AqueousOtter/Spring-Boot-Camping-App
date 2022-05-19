import React from 'react'
import { NavLink } from 'react-router-dom'
import './NavBar.css'
export default function NavBar() {
  return (
    <div className='navbar'>
              <NavLink to='/home'><p>evergreen grove</p></NavLink>
              <div className="navlinks">
                <a href='#about'><p>about</p></a>
                <a href='#activities'><p>activities</p></a>
                <a href='#rates'><p>rates</p></a>
                <NavLink to='/reserve'><p>reserve</p></NavLink>
                <NavLink to='/contact'><p>contact</p></NavLink>
                
              </div>  
    </div>
  )
}
