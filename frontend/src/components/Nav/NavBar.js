import React from 'react'
import { NavLink } from 'react-router-dom'
import './NavBar.css'
export default function NavBar() {
  return (
    <div className='navbar'>
              <NavLink to='/home'><p>evergreen grove</p></NavLink>
              <div className="navlinks">
                <a href='#about'><p>about</p></a>
                <NavLink to='/activities'><p>activities</p></NavLink>
                <NavLink to='/rates'><p>rates</p></NavLink>
                <NavLink to='/reserve'><p>reserve</p></NavLink>
                <NavLink to='/contact'><p>contact</p></NavLink>
                
              </div>  
    </div>
  )
}
