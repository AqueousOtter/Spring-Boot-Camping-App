import React from 'react'
import { NavLink } from 'react-router-dom'
import './NavBar.css'
export default function NavBar() {
  return (
    <div className='navbar'>
              <a href='/'><p>evergreen grove</p></a>
              <div className="navlinks">
                <NavLink to='/about'><p>about</p></NavLink>
                <NavLink to='/activities'><p>activities</p></NavLink>
                <NavLink to='/rates'><p>rates</p></NavLink>
                <NavLink to='/reserve'><p>reserve</p></NavLink>
                <NavLink to='/contact'><p>contact</p></NavLink>
                
              </div>  
    </div>
  )
}
